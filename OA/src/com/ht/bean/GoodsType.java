package com.ht.bean;

/**
 * ��Ʒ���ͱ�
 * @author Administrator
 *
 */
public class GoodsType {

	private String goodsTypeId; // ��Ʒ���ͱ��
	private String name; // ��Ʒ����
	private String des; // ��Ʒ����
	private int status; // ״̬��Ĭ�Ͽ���
	public String getGoodsTypeId() {
		return goodsTypeId;
	}
	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}