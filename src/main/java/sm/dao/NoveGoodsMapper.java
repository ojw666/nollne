package sm.dao;

import java.util.List;

import sm.pojo.NoveGoods;

public interface NoveGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_goods
     *
     * @mbggenerated
     */
    int insert(NoveGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_goods
     *
     * @mbggenerated
     */
    int insertSelective(NoveGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_goods
     *
     * @mbggenerated
     */
    NoveGoods selectByPrimaryKey(Integer goodsId);
    List<NoveGoods> selectLeft(Integer goodsId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NoveGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(NoveGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nove_goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NoveGoods record);
}