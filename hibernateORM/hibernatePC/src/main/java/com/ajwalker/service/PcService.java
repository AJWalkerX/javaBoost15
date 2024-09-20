package com.ajwalker.service;

import com.ajwalker.entity.Components;
import com.ajwalker.entity.Pc;
import com.ajwalker.repository.PcRepository;

import java.util.*;

public class PcService extends ServiceManager<Pc, Long> {
    private final PcRepository pcRepository;
    private ComponentService componentService = new ComponentService();

    public PcService() {
        this(new PcRepository());
    }

    private PcService(PcRepository pcRepository) {
        super(pcRepository);
        this.pcRepository = pcRepository;
    }

    public void FindPcComponents(){
        List<Components> GraphComponentList = componentService.findByFieldNameAndValue("comp_type", "GRAPHICCARD");
        Set<String> pcNameSet = new HashSet<>();
       GraphComponentList.forEach(components -> {
           Optional<Pc> pc = pcRepository.findById(components.getId());
           pc.ifPresent(pc1 -> {
               pcNameSet.add(pc1.getBrand());
           });
       });
       pcNameSet.forEach(System.out::println);
    }
}
