package com.ubi.model;

import java.util.Date;

public class ArticleTag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_tag.tbid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    private Long tbid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_tag.articletagid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    private Byte articletagid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_tag.articleid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    private Long articleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article_tag.createtime
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_tag.tbid
     *
     * @return the value of tb_article_tag.tbid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public Long getTbid() {
        return tbid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_tag.tbid
     *
     * @param tbid the value for tb_article_tag.tbid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public void setTbid(Long tbid) {
        this.tbid = tbid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_tag.articletagid
     *
     * @return the value of tb_article_tag.articletagid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public Byte getArticletagid() {
        return articletagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_tag.articletagid
     *
     * @param articletagid the value for tb_article_tag.articletagid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public void setArticletagid(Byte articletagid) {
        this.articletagid = articletagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_tag.articleid
     *
     * @return the value of tb_article_tag.articleid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public Long getArticleid() {
        return articleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_tag.articleid
     *
     * @param articleid the value for tb_article_tag.articleid
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article_tag.createtime
     *
     * @return the value of tb_article_tag.createtime
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article_tag.createtime
     *
     * @param createtime the value for tb_article_tag.createtime
     *
     * @mbggenerated Mon Nov 20 19:27:04 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}