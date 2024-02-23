package com.tugcetasyildiz.n11homework2.general.baseController;

import com.tugcetasyildiz.n11homework2.general.*;
import com.tugcetasyildiz.n11homework2.general.baseEntity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public abstract class BaseController<E extends BaseEntity,
        DTO extends BaseDTO,
        Repo extends BaseRepository<E>,
        R extends BaseRequest,
        S extends BaseService<E, Repo, DTO, R, M>,
        M extends BaseMapper<E, DTO, R>> {

    protected abstract S getService();

    @GetMapping
    public ResponseEntity<RestResponse<List<DTO>>> getAll() {
        List<DTO> all = getService().getAll();
        return ResponseEntity.ok(RestResponse.of(all));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<DTO>> getById(@PathVariable Long id) {
        DTO getById = getService().getById(id);
        return ResponseEntity.ok(RestResponse.of(getById));
    }

    @PostMapping
    public ResponseEntity<RestResponse<E>> save(@RequestBody R request) {
        return ResponseEntity.ok(RestResponse.of(getService().save(request)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<DTO>> update(@PathVariable Long id, @RequestBody R request) {
        return ResponseEntity.ok(RestResponse.of(getService().update(id, request)));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        getService().delete(id);
    }

}
