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
					System.out.println("�����ߣ���Ʒ��治�㣬�޷����ѡ�����");

					try {
						store.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				store.setAmount(store.getAmount() - DEL);
				System.out.println("�����ߣ�������һ�Σ�ʣ��" + store.getAmount());
				store.notifyAll();
			}
		}

	}

}
