package com.cs2c.dvs.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.pojo.Data;

public interface DataDao {
	List<Data> queryData(Pager pager, String name, String project, String affliation) throws SQLException;
	int getCount(String name, String project, String affliation) throws SQLException;
	void addData(Data data) throws SQLException;
	void deleteData() throws SQLException;
	List<Data> queryData(String name, String project, String affliation) throws SQLException;
	List<HashMap> queryRank(String community) throws SQLException;
}
