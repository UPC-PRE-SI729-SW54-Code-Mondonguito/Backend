package com.example.backend.user.interfaces.rest;

import com.example.backend.user.domain.model.queries.GetUsuarioByDNI;
import com.example.backend.user.domain.services.UsuarioCommandService;
import com.example.backend.user.domain.services.UsuarioQueryService;
import com.example.backend.user.interfaces.rest.resources.CreateUsuarioResource;
import com.example.backend.user.interfaces.rest.resources.UsuarioResource;
import com.example.backend.user.interfaces.rest.transform.CreateUsuarioCommandFromResourceAssembler;
import com.example.backend.user.interfaces.rest.transform.UsuarioResourceFromEntityAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioCommandService usuarioCommandService;
    private final UsuarioQueryService usuarioQueryService;

    public UsuarioController(UsuarioCommandService usuarioCommandService, UsuarioQueryService usuarioQueryService) {
        this.usuarioCommandService = usuarioCommandService;
        this.usuarioQueryService = usuarioQueryService;

    }
    @PostMapping
    public ResponseEntity<UsuarioResource> save(@RequestBody CreateUsuarioResource resource) {
        var createUsuarioCommand = CreateUsuarioCommandFromResourceAssembler.toCommandFromResource(resource);
        var usuario = usuarioCommandService.handle(createUsuarioCommand);

        if (usuario.isEmpty()) {return ResponseEntity.badRequest().build();}

        var usuarioResource = UsuarioResourceFromEntityAssembler.toResourceFromEntity(usuario.get());

        return new ResponseEntity<>(usuarioResource, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<UsuarioResource> getUsuarioById(@PathVariable String id) {
        var getUsuarioByDNI = new GetUsuarioByDNI(id);
        var usuario = usuarioQueryService.handle(getUsuarioByDNI);
        if (usuario.isEmpty()) {return ResponseEntity.badRequest().build();}
        var usuarioResource = UsuarioResourceFromEntityAssembler.toResourceFromEntity(usuario.get());
        return ResponseEntity.ok(usuarioResource);

    }

}