package com.zd.store;

public class Product implements Runnable {

	private static final int MAKE = 40;

	private Store store;

	public Product(Store store) {
		super();
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			synchronized (store) {

				while (store.getAmount() + MAKE >Store.MAX) {
					System.out.println("生产者：仓库已满，无需生产商品。。。");

					try {
						store.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}

				store.setAmount(store.getAmount() + MAKE);
				System.out.println("生产者：生产了一次商品，商品剩余" + store.getAmount());
				store.notifyAll();
			}
		}
	}

}
