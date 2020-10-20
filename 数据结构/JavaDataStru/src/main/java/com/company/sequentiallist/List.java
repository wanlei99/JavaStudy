package com.company.sequentiallist;

/**
 * @ClassName List
 * @Description TODO
 * @Author WL
 * @Date 2020/10/20
 **/
public interface List<T> {
    /**
     * 获得线性表长度
     * @return
     */
    public int size();

    /**
     * 判断线性表是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 插入元素
     * @param index
     * @param obj
     * @throws Exception
     */
    public int insert(int index, Object obj) throws Exception;

    /**
     * 删除
     * @param index
     * @return
     * @throws Exception
     */
    public T remove (int index) throws Exception;

    /**
     * 获取指定位置的元素
     * @param index
     * @return
     * @throws Exception
     */
    public Object get (int index) throws Exception;

    /**
     * 设置第i个元素的值
     * @param i
     * @param x
     * @return
     * @throws Exception
     */
    public Object set (int i,T x) throws Exception;

    /**
     * 查询
     * @param key
     * @return
     */
    public int search(T key) ;


}
