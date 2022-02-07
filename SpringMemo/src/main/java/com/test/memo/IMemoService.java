package com.test.memo;

import java.util.List;

public interface IMemoService {
	
	List<MemoDTO> list();

	int add(MemoDTO dto);

}
