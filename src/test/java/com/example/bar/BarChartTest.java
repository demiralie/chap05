package com.example.bar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.DeptVO;
import com.example.domain.EmpVO;
import com.example.repository.DeptRepository;

import be.ceau.chart.BarChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.options.BarOptions;

@RunWith(SpringRunner.class)
@SpringBootTest

public class BarChartTest {

	@Inject
	DeptRepository deptRepository;

	@Test
	@Transactional
	public void testFindAll() {
		deptRepository.findAll().forEach(e -> {
			System.out.println(e);
			System.out.println(e.getEmps());
		});
	}

	@Test
	@Transactional
	public void test2() throws IOException {

		List<DeptVO> depts = deptRepository.findAll();

		List<BarChart> bars = new ArrayList<>();

		for (DeptVO dept : depts) {
			BarChart bar = new BarChart();
			BarData data = new BarData();
			BarOptions options = new BarOptions();

			bar.setData(data);
			bar.setOptions(options);

			BarDataset set = new BarDataset();

			List<EmpVO> emps = dept.getEmps();
			for (EmpVO emp : emps) {
				set.addData(emp.getSal());
				data.addLabel(emp.getEname());
			}

			set.setLabel(dept.getDeptno() + ", " + dept.getDname());
			set.addBackgroundColor(Color.random());
			data.addDataset(set);

			bars.add(bar);
		}

		bars.forEach(e -> System.out.println(e.toJson()));
	}

	// @Test
	// public void test() throws IOException {
	//
	// BarChart bar = new BarChart();
	// BarData data = new BarData();
	// BarOptions options = new BarOptions();
	//
	// bar.setData(data);
	// bar.setOptions(options);
	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// // DataSet
	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// BarDataset set1 = new BarDataset();
	// set1.setData(1200, 1500, 1700, 1550, 1440); //sal
	// set1.setLabel("1988"); //ename
	// set1.addBackgroundColor(Color.HOT_PINK); //color
	//
	// BarDataset set2 = new BarDataset();
	// set2.setData(550, 1500, 900, 400, 300);
	// set2.setLabel("1989");
	// set2.addBackgroundColor(Color.YELLOW);
	//
	// BarDataset set3 = new BarDataset();
	// set3.setData(700, 1000, 400, 600, 200);
	// set3.setLabel("2000");
	// set3.addBackgroundColor(Color.GREEN_YELLOW);
	//
	// data.addDataset(set1);
	// data.addDataset(set2);
	// data.addDataset(set3);
	// data.setLabels("1M", "2M", "3M", "4M", "5M");
	//
	// Opener.inBrowser(bar);
	//
	//
	// }

}
