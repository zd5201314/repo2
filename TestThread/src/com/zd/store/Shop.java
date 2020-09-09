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
			 * ����̰߳�ȫ���⣬�������⣬�����������ʹ�߳̽���ͬ��״̬
			 * 1��ͬ����������ͬ��Դ���϶��������ڷ��ʹ�����Դ��ʱ��
			 * ���̻߳������������У�������������ӵ�еĶ������Ĳ���ȥ������Դ���Ż��������״̬
			 */
			synchronized (store) {

				if (store.getAmount() > 0) {

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					store.setAmount(store.getAmount() - 1);

					System.out.println(name + "�̵�����һ����Ʒ��ʣ��" + store.getAmount() + "����Ʒ��");
				} else {
					break;
				}
			}
		}
	}

}
