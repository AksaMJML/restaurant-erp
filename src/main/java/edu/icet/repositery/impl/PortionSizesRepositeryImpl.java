package edu.icet.repositery.impl;

import edu.icet.model.PortionSizes;
import edu.icet.repositery.PortionSizesRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@RequiredArgsConstructor
public class PortionSizesRepositeryImpl implements PortionSizesRepositery {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<PortionSizes> getAll() {
        String sql = "SELECT * FROM portionSizes";
        List<PortionSizes> portionSizesList = jdbcTemplate.query(sql , (rs, rowNum) -> {
         PortionSizes portionSizes = new PortionSizes();
            portionSizes.setPortionSizeId(rs.getInt(1));
            portionSizes.setSizeName(rs.getString(2));
            portionSizes.setDescription(rs.getString(3));
            portionSizes.setCreatedAt(rs.getTimestamp(4));
            return  portionSizes;
        });
        return portionSizesList;
    }
}
