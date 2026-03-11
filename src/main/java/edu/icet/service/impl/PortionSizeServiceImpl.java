package edu.icet.service.impl;

import edu.icet.model.PortionSizes;
import edu.icet.repositery.PortionSizesRepositery;
import edu.icet.service.PortionSizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PortionSizeServiceImpl implements PortionSizeService {

    private final PortionSizesRepositery repositery;

    @Override
    public List<PortionSizes> getAll() {
        return repositery.getAll();
    }
}
