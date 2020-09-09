package com.zd.store;

public class Shop implements Runnable {

	private String name;
	private Store store;

	public Shop(String name, Store store) {
		this.name = name;
		this.store = store;
	}

	@Override
	public void run() {

		while (true) {
			
			/**
			 * 解决线程安全问题，并发问题，加入对象锁，使线程进入同步状态
			 * 1，同步锁，给共同资源加上对象锁，在访问公共资源的时候，
			 * 多线程会进入对象锁池中，共抢对象锁，拥有的对象锁的才能去访问资源，才会进入运行状态
			 */
			synchronized (store) {

				if (store.getAmount() > 0) {

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					store.setAmount(store.getAmount() - 1);

					System.out.println(name + "商店卖了一个商品，剩余" + store.getAmount() + "件商品。");
				} else {
					break;
				}
			}
		}
	}

}
