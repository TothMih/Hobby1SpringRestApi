package hu.tothmih.demo.controller;

import hu.tothmih.demo.model.Coordinator;
import hu.tothmih.demo.model.Protocol;
import hu.tothmih.demo.repo.interfaces.ProtocolRepository;
import hu.tothmih.demo.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProtocolAPIController {
    @Autowired
    ProtocolService protocolService;

    @GetMapping(value = "/protocol",name = "List of all protocols.")
    public List<Protocol> getAllProtocols(){
        return protocolService.getAllProtocol();
    }

    @PostMapping(value = "/protocol",name = "Save protocol")
    private long saveProtocol(@RequestBody Protocol protocol){
        protocolService.saveOrUpdate(protocol);
        return protocol.getId();
    }

    @PutMapping(value = "/protocol", name ="Update protocol")
    private Protocol update(@RequestBody Protocol protocol){
        protocolService.saveOrUpdate(protocol);
        return protocol;
    }

    @DeleteMapping(value = "/api/protocol/{protocolid}", name ="Delete protocol")
    private void deleteProtocol(@PathVariable("protocolid") Long protocolid){
        protocolService.delete(protocolid);
    }
}
