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
					System.out.println("�����ߣ��ֿ�����������������Ʒ������");

					try {
						store.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}

				store.setAmount(store.getAmount() + MAKE);
				System.out.println("�����ߣ�������һ����Ʒ����Ʒʣ��" + store.getAmount());
				store.notifyAll();
			}
		}
	}

}
