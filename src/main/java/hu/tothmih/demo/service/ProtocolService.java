package hu.tothmih.demo.service;

import hu.tothmih.demo.model.Coordinator;
import hu.tothmih.demo.model.Protocol;
import hu.tothmih.demo.repo.interfaces.ProtocolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProtocolService {
    @Autowired
    ProtocolRepository protocolRepository;

    public List<Protocol> getAllProtocol(){
        List<Protocol> protocols=new ArrayList<>();
        protocolRepository.findAll().forEach(coordinator -> protocols.add(coordinator));
        return protocols;
    }

    public Protocol getCoordinatorById(Long id){
        return protocolRepository.findById(id).get();
    }

    public void saveOrUpdate(Protocol protocol){
        protocolRepository.save(protocol);
    }

    public void delete(Long id){
        protocolRepository.deleteById(id);
    }

    public void update(Protocol protocol, Long id) {
        protocolRepository.save(protocol);
    }

}
