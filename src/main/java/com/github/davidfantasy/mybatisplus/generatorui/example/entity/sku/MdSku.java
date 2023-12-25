package com.github.davidfantasy.mybatisplus.generatorui.example.entity.sku;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * sku
 * </p>
 *
 * @author wangkui
 * @since 2023-12-22
 */
@TableName("md_sku")
public class MdSku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 集团代码
     */
    private String groupCode;

    /**
     * spu表的主键
     */
    private String spuId;

    /**
     * spu
     */
    private String spu;

    /**
     * sku(款号)
     */
    private String sku;

    /**
     * 运营平台skuId
     */
    private String lmsSkuId;

    /**
     * 图片
     */
    private String pictureUrl;

    /**
     * 颜色
     */
    private String color;

    /**
     * 尺码
     */
    private String size;

    /**
     * 英文颜色（采购规格）
     */
    private String colorEn;

    /**
     * 参考中文颜色（采购规格）
     */
    private String colorCh;

    /**
     * 规格
     */
    private String specifications;

    /**
     * 英文尺码（采购规格）
     */
    private String specificationsEn;

    /**
     * 参考中文尺码（采购规格）
     */
    private String specificationsCh;

    /**
     * 采购颜色
     */
    private String purchaseColor;

    /**
     * 采购规格
     */
    private String purchaseSpecifications;

    /**
     * 供货价
     */
    private BigDecimal supplyPrice;

    /**
     * 销售价
     */
    private BigDecimal salePrice;

    /**
     * 删除状态 0-正常，1-删除
     */
    private Byte isDelete;

    /**
     * 创建人id
     */
    private String createId;

    /**
     * 创建人名称
     */
    private String createName;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人id
     */
    private String modifiedId;

    /**
     * 修改人名称
     */
    private String modifiedName;

    /**
     * 修改时间
     */
    private Date modifiedDate;
    private Integer erpId;

    /**
     * 销售颜色(规格描述 如： 黄色，S，（销售属性）)
     */
    private String salesColor;

    /**
     * 英文销售颜色(规格描述 如： 黄色，S，（销售属性）)
     */
    private String salesColorEn;

    /**
     * 中文销售颜色(规格描述 如： 黄色，S，（销售属性）)
     */
    private String salesColorCh;

    /**
     * 销售规格(规格描述 如： 黄色，S，（销售属性）)
     */
    private String salesSpecifications;

    /**
     * 英文销售规格(规格描述 如： 黄色，S，（销售属性）)
     */
    private String salesSpecificationsEn;

    /**
     * 中文销售规格(规格描述 如： 黄色，S，（销售属性）)
     */
    private String salesSpecificationsCh;

    /**
     * lms spu表的主键
     */
    private String lmsSpuId;

    /**
     * 原文规格（销售规格）
     */
    private String salesSpecificationsAttribute;

    /**
     * 英文规格（销售规格）
     */
    private String salesSpecificationsAttributeEn;

    /**
     * 中文规格（销售规格）
     */
    private String salesSpecificationsAttributeCh;

    /**
     * 原文规格（采购规格）
     */
    private String specificationsAttribute;

    /**
     * 英文规格（采购规格）
     */
    private String specificationsAttributeEn;

    /**
     * 中文规格（采购规格）
     */
    private String specificationsAttributeCh;

    /**
     * 重量(克)
     */
    private BigDecimal weight;

    /**
     * 长(cm)
     */
    private BigDecimal length;

    /**
     * 宽(cm)
     */
    private BigDecimal width;

    /**
     * 高(cm)
     */
    private BigDecimal height;

    /**
     * 是否组合sku 0-否，1-是
     */
    private Byte isGroup;

    /**
     * 是否可拆分发 0-否， 1-是
     */
    private Byte isSplit;

    /**
     * 审版SKU，0：默认否，1：是
     */
    private Byte isSample;

    /**
     * 启用状态，0：启用，1：作废，2：LMS删除,默认启用
     */
    private Byte enable;

    /**
     * 缺货状态 1:缺货 0:不缺货
     */
    private Integer stockOut;

    /**
     * 头程运费
     */
    private BigDecimal firstFreight;

    /**
     * 侵权标记：0(否)、1(是)
     */
    private Integer tortFlag;

    /**
     * 侵权等级：低、中、高
     */
    private Integer tortLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getLmsSkuId() {
        return lmsSkuId;
    }

    public void setLmsSkuId(String lmsSkuId) {
        this.lmsSkuId = lmsSkuId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColorEn() {
        return colorEn;
    }

    public void setColorEn(String colorEn) {
        this.colorEn = colorEn;
    }

    public String getColorCh() {
        return colorCh;
    }

    public void setColorCh(String colorCh) {
        this.colorCh = colorCh;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getSpecificationsEn() {
        return specificationsEn;
    }

    public void setSpecificationsEn(String specificationsEn) {
        this.specificationsEn = specificationsEn;
    }

    public String getSpecificationsCh() {
        return specificationsCh;
    }

    public void setSpecificationsCh(String specificationsCh) {
        this.specificationsCh = specificationsCh;
    }

    public String getPurchaseColor() {
        return purchaseColor;
    }

    public void setPurchaseColor(String purchaseColor) {
        this.purchaseColor = purchaseColor;
    }

    public String getPurchaseSpecifications() {
        return purchaseSpecifications;
    }

    public void setPurchaseSpecifications(String purchaseSpecifications) {
        this.purchaseSpecifications = purchaseSpecifications;
    }

    public BigDecimal getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(BigDecimal supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifiedId() {
        return modifiedId;
    }

    public void setModifiedId(String modifiedId) {
        this.modifiedId = modifiedId;
    }

    public String getModifiedName() {
        return modifiedName;
    }

    public void setModifiedName(String modifiedName) {
        this.modifiedName = modifiedName;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getErpId() {
        return erpId;
    }

    public void setErpId(Integer erpId) {
        this.erpId = erpId;
    }

    public String getSalesColor() {
        return salesColor;
    }

    public void setSalesColor(String salesColor) {
        this.salesColor = salesColor;
    }

    public String getSalesColorEn() {
        return salesColorEn;
    }

    public void setSalesColorEn(String salesColorEn) {
        this.salesColorEn = salesColorEn;
    }

    public String getSalesColorCh() {
        return salesColorCh;
    }

    public void setSalesColorCh(String salesColorCh) {
        this.salesColorCh = salesColorCh;
    }

    public String getSalesSpecifications() {
        return salesSpecifications;
    }

    public void setSalesSpecifications(String salesSpecifications) {
        this.salesSpecifications = salesSpecifications;
    }

    public String getSalesSpecificationsEn() {
        return salesSpecificationsEn;
    }

    public void setSalesSpecificationsEn(String salesSpecificationsEn) {
        this.salesSpecificationsEn = salesSpecificationsEn;
    }

    public String getSalesSpecificationsCh() {
        return salesSpecificationsCh;
    }

    public void setSalesSpecificationsCh(String salesSpecificationsCh) {
        this.salesSpecificationsCh = salesSpecificationsCh;
    }

    public String getLmsSpuId() {
        return lmsSpuId;
    }

    public void setLmsSpuId(String lmsSpuId) {
        this.lmsSpuId = lmsSpuId;
    }

    public String getSalesSpecificationsAttribute() {
        return salesSpecificationsAttribute;
    }

    public void setSalesSpecificationsAttribute(String salesSpecificationsAttribute) {
        this.salesSpecificationsAttribute = salesSpecificationsAttribute;
    }

    public String getSalesSpecificationsAttributeEn() {
        return salesSpecificationsAttributeEn;
    }

    public void setSalesSpecificationsAttributeEn(String salesSpecificationsAttributeEn) {
        this.salesSpecificationsAttributeEn = salesSpecificationsAttributeEn;
    }

    public String getSalesSpecificationsAttributeCh() {
        return salesSpecificationsAttributeCh;
    }

    public void setSalesSpecificationsAttributeCh(String salesSpecificationsAttributeCh) {
        this.salesSpecificationsAttributeCh = salesSpecificationsAttributeCh;
    }

    public String getSpecificationsAttribute() {
        return specificationsAttribute;
    }

    public void setSpecificationsAttribute(String specificationsAttribute) {
        this.specificationsAttribute = specificationsAttribute;
    }

    public String getSpecificationsAttributeEn() {
        return specificationsAttributeEn;
    }

    public void setSpecificationsAttributeEn(String specificationsAttributeEn) {
        this.specificationsAttributeEn = specificationsAttributeEn;
    }

    public String getSpecificationsAttributeCh() {
        return specificationsAttributeCh;
    }

    public void setSpecificationsAttributeCh(String specificationsAttributeCh) {
        this.specificationsAttributeCh = specificationsAttributeCh;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Byte getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Byte isGroup) {
        this.isGroup = isGroup;
    }

    public Byte getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(Byte isSplit) {
        this.isSplit = isSplit;
    }

    public Byte getIsSample() {
        return isSample;
    }

    public void setIsSample(Byte isSample) {
        this.isSample = isSample;
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public Integer getStockOut() {
        return stockOut;
    }

    public void setStockOut(Integer stockOut) {
        this.stockOut = stockOut;
    }

    public BigDecimal getFirstFreight() {
        return firstFreight;
    }

    public void setFirstFreight(BigDecimal firstFreight) {
        this.firstFreight = firstFreight;
    }

    public Integer getTortFlag() {
        return tortFlag;
    }

    public void setTortFlag(Integer tortFlag) {
        this.tortFlag = tortFlag;
    }

    public Integer getTortLevel() {
        return tortLevel;
    }

    public void setTortLevel(Integer tortLevel) {
        this.tortLevel = tortLevel;
    }

    @Override
    public String toString() {
        return "MdSku{" +
        ", id = " + id +
        ", groupCode = " + groupCode +
        ", spuId = " + spuId +
        ", spu = " + spu +
        ", sku = " + sku +
        ", lmsSkuId = " + lmsSkuId +
        ", pictureUrl = " + pictureUrl +
        ", color = " + color +
        ", size = " + size +
        ", colorEn = " + colorEn +
        ", colorCh = " + colorCh +
        ", specifications = " + specifications +
        ", specificationsEn = " + specificationsEn +
        ", specificationsCh = " + specificationsCh +
        ", purchaseColor = " + purchaseColor +
        ", purchaseSpecifications = " + purchaseSpecifications +
        ", supplyPrice = " + supplyPrice +
        ", salePrice = " + salePrice +
        ", isDelete = " + isDelete +
        ", createId = " + createId +
        ", createName = " + createName +
        ", createDate = " + createDate +
        ", modifiedId = " + modifiedId +
        ", modifiedName = " + modifiedName +
        ", modifiedDate = " + modifiedDate +
        ", erpId = " + erpId +
        ", salesColor = " + salesColor +
        ", salesColorEn = " + salesColorEn +
        ", salesColorCh = " + salesColorCh +
        ", salesSpecifications = " + salesSpecifications +
        ", salesSpecificationsEn = " + salesSpecificationsEn +
        ", salesSpecificationsCh = " + salesSpecificationsCh +
        ", lmsSpuId = " + lmsSpuId +
        ", salesSpecificationsAttribute = " + salesSpecificationsAttribute +
        ", salesSpecificationsAttributeEn = " + salesSpecificationsAttributeEn +
        ", salesSpecificationsAttributeCh = " + salesSpecificationsAttributeCh +
        ", specificationsAttribute = " + specificationsAttribute +
        ", specificationsAttributeEn = " + specificationsAttributeEn +
        ", specificationsAttributeCh = " + specificationsAttributeCh +
        ", weight = " + weight +
        ", length = " + length +
        ", width = " + width +
        ", height = " + height +
        ", isGroup = " + isGroup +
        ", isSplit = " + isSplit +
        ", isSample = " + isSample +
        ", enable = " + enable +
        ", stockOut = " + stockOut +
        ", firstFreight = " + firstFreight +
        ", tortFlag = " + tortFlag +
        ", tortLevel = " + tortLevel +
        "}";
    }
}
