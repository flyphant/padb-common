package cn.iq99.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ArrayUtil {
	
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			log.info(" {},",array[i]);
		}
	}
}
