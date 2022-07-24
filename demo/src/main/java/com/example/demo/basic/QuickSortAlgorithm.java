package com.example.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		//logic for Quick sort
		return numbers;
	}

}
