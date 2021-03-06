/*
 * Copyright 2012-2013 EZC Group S.A. RCS Luxembourg B140949
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 */

package com.yobidrive.diskmap.buckets;

import com.google.common.cache.Weigher;
import com.yobidrive.diskmap.needles.NeedlePointer;

public class NeedlePointerWeighter implements Weigher <Long, NeedlePointer> {

	public int weigh(Long bucket, NeedlePointer pointer) {
		return NeedlePointer.POINTERSIZE 
				+ 8 // inner long size
				+ 140 ; // 140: estimated cache hash map overhead
	}

}
