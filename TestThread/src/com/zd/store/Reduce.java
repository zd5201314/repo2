package com.zd.store;

public class Reduce implements Runnable {

	private static final int DEL = 60;
	private Store store;

	public Reduce(Store store) {
		super();
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			synchronized (store) {

				while (store.getAmount() - DEL < store.MIN) {
					System.out.println("消费者：商品库存不足，无法消费。。。");

					try {
						store.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				store.setAmount(store.getAmount() - DEL);
				System.out.println("消费者：消费了一次，剩余" + store.getAmount());
				store.notifyAll();
			}
		}

	}

}
