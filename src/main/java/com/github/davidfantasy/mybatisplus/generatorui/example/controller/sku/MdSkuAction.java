package com.github.davidfantasy.mybatisplus.generatorui.example.controller.sku;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.github.davidfantasy.mybatisplus.generatorui.example.service.sku.MdSkuService;
import com.github.davidfantasy.mybatisplus.generatorui.example.entity.sku.MdSku;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * sku 前端控制器
 * </p>
 *
 * @author wangkui
 * @since 2023-12-22
 */
@Controller
@RequestMapping("/md-sku")
public class MdSkuAction {


    @Autowired
    private MdSkuService mdSkuService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<MdSku>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<MdSku> aPage = mdSkuService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<MdSku> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(mdSkuService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody MdSku params) {
        mdSkuService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        mdSkuService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> update(@RequestBody MdSku params) {
        mdSkuService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
