package com.example.demo.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
    
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int [] numbers,int numberToSearchFor)
	{
		//BubbleSortAlgorithm bubbleSortAlgorithm=new BubbleSortAlgorithm();
		//int[] sortedNumbers=bubbleSortAlgorithm.sort(numbers);
		int[] sortedNumbers=sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//implement logic for sorting array
		//search array
		//return the array
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}
	

}
