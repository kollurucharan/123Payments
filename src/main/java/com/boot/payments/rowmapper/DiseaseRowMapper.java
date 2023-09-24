package com.boot.payments.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.boot.payments.model.DiseaseModel;


public class DiseaseRowMapper implements RowMapper<DiseaseModel> {
    @Override
    public DiseaseModel mapRow(ResultSet rs, int rowNum) throws SQLException {
    	DiseaseModel dm = new DiseaseModel();
    	dm.setDisc_id(rs.getInt("disc_id"));
    	dm.setDisc_name(rs.getString("disc_name"));
    	dm.setDisc_icdcode(rs.getString("disc_icdcode"));
        dm.setDisc_desc(rs.getString("disc_desc"));
        dm.setDisc_status(rs.getString("disc_status"));
        return dm;
    }
}