/*
 * Copyright 2012-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.jta.bitronix;

import javax.sql.XADataSource;

import org.springframework.boot.jdbc.XADataSourceWrapper;

/**
 * {@link XADataSourceWrapper} that uses a Bitronix {@link PoolingDataSourceBean} to wrap
 * a {@link XADataSource}.
 *
 * @author Phillip Webb
 * @since 1.2.0
 * @deprecated since 2.3.0 for removal in 2.5.0 as the Bitronix project is no longer being
 * maintained
 */
@Deprecated
public class BitronixXADataSourceWrapper implements XADataSourceWrapper {

	@Override
	public PoolingDataSourceBean wrapDataSource(XADataSource dataSource) throws Exception {
		PoolingDataSourceBean pool = new PoolingDataSourceBean();
		pool.setDataSource(dataSource);
		return pool;
	}

}