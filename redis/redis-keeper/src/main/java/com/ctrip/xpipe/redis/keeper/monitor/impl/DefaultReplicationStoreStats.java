package com.ctrip.xpipe.redis.keeper.monitor.impl;

import java.util.concurrent.atomic.AtomicLong;

import com.ctrip.xpipe.redis.keeper.monitor.ReplicationStoreStats;

/**
 * @author wenchao.meng
 *
 * Mar 10, 2017
 */
public class DefaultReplicationStoreStats implements ReplicationStoreStats{
	
	private AtomicLong replicationStoreCreateCount = new AtomicLong();

	@Override
	public void increateReplicationStoreCreateCount() {
		replicationStoreCreateCount.incrementAndGet();
		
	}

	@Override
	public long getReplicationStoreCreateCount() {
		return replicationStoreCreateCount.get();
	}

}
