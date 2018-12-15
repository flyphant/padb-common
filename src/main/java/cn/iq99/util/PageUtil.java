package cn.iq99.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PageUtil {

	/**
	 * jpa默认分页从第0页开始,需要转成从1开始
	 * @param pageable
	 * @return
	 */
	public static PageRequest getPageRequest(Pageable pageable){
		
		PageRequest request=new PageRequest(pageable.getPageNumber()-1, pageable.getPageSize());
		return request;
	}
}
