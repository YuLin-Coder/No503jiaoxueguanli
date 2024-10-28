package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.PaikeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 课程表信息
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("paike")
public class PaikeView extends PaikeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 第几节的值
	*/
	@ColumnInfo(comment="第几节的字典表值",type="varchar(200)")
	private String jiekeValue;
	/**
	* 学期的值
	*/
	@ColumnInfo(comment="学期的字典表值",type="varchar(200)")
	private String xueqiValue;
	/**
	* 周次的值
	*/
	@ColumnInfo(comment="周次的字典表值",type="varchar(200)")
	private String xingqiValue;

	//级联表 教师
		/**
		* 工号
		*/

		@ColumnInfo(comment="工号",type="varchar(200)")
		private String jiaoshiUuidNumber;
		/**
		* 教师姓名
		*/

		@ColumnInfo(comment="教师姓名",type="varchar(200)")
		private String jiaoshiName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(255)")
		private String jiaoshiPhoto;
		/**
		* 联系方式
		*/

		@ColumnInfo(comment="联系方式",type="varchar(200)")
		private String jiaoshiPhone;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String jiaoshiEmail;
		/**
		* 班级
		*/
		@ColumnInfo(comment="班级",type="int(11)")
		private Integer banjiTypes;
			/**
			* 班级的值
			*/
			@ColumnInfo(comment="班级的字典表值",type="varchar(200)")
			private String banjiValue;
		/**
		* 假删
		*/

		@ColumnInfo(comment="假删",type="int(11)")
		private Integer jiaoshiDelete;
	//级联表 课程
		/**
		* 课程编号
		*/

		@ColumnInfo(comment="课程编号",type="varchar(200)")
		private String kechengUuidNumber;
		/**
		* 课程名称
		*/

		@ColumnInfo(comment="课程名称",type="varchar(200)")
		private String kechengName;
		/**
		* 课程封面
		*/

		@ColumnInfo(comment="课程封面",type="varchar(200)")
		private String kechengPhoto;
		/**
		* 课程类型
		*/
		@ColumnInfo(comment="课程类型",type="int(11)")
		private Integer kechengTypes;
			/**
			* 课程类型的值
			*/
			@ColumnInfo(comment="课程类型的字典表值",type="varchar(200)")
			private String kechengValue;
		/**
		* 课程热度
		*/

		@ColumnInfo(comment="课程热度",type="int(11)")
		private Integer kechengClicknum;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
					 
		/**
		* 课程 的 教师
		*/
		@ColumnInfo(comment="教师",type="int(11)")
		private Integer kechengJiaoshiId;
		/**
		* 课程介绍
		*/

		@ColumnInfo(comment="课程介绍",type="longtext")
		private String kechengContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer kechengDelete;



	public PaikeView() {

	}

	public PaikeView(PaikeEntity paikeEntity) {
		try {
			BeanUtils.copyProperties(this, paikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 第几节的值
	*/
	public String getJiekeValue() {
		return jiekeValue;
	}
	/**
	* 设置： 第几节的值
	*/
	public void setJiekeValue(String jiekeValue) {
		this.jiekeValue = jiekeValue;
	}
	//当前表的
	/**
	* 获取： 学期的值
	*/
	public String getXueqiValue() {
		return xueqiValue;
	}
	/**
	* 设置： 学期的值
	*/
	public void setXueqiValue(String xueqiValue) {
		this.xueqiValue = xueqiValue;
	}
	//当前表的
	/**
	* 获取： 周次的值
	*/
	public String getXingqiValue() {
		return xingqiValue;
	}
	/**
	* 设置： 周次的值
	*/
	public void setXingqiValue(String xingqiValue) {
		this.xingqiValue = xingqiValue;
	}


	//级联表的get和set 教师

		/**
		* 获取： 工号
		*/
		public String getJiaoshiUuidNumber() {
			return jiaoshiUuidNumber;
		}
		/**
		* 设置： 工号
		*/
		public void setJiaoshiUuidNumber(String jiaoshiUuidNumber) {
			this.jiaoshiUuidNumber = jiaoshiUuidNumber;
		}

		/**
		* 获取： 教师姓名
		*/
		public String getJiaoshiName() {
			return jiaoshiName;
		}
		/**
		* 设置： 教师姓名
		*/
		public void setJiaoshiName(String jiaoshiName) {
			this.jiaoshiName = jiaoshiName;
		}

		/**
		* 获取： 头像
		*/
		public String getJiaoshiPhoto() {
			return jiaoshiPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setJiaoshiPhoto(String jiaoshiPhoto) {
			this.jiaoshiPhoto = jiaoshiPhoto;
		}

		/**
		* 获取： 联系方式
		*/
		public String getJiaoshiPhone() {
			return jiaoshiPhone;
		}
		/**
		* 设置： 联系方式
		*/
		public void setJiaoshiPhone(String jiaoshiPhone) {
			this.jiaoshiPhone = jiaoshiPhone;
		}

		/**
		* 获取： 邮箱
		*/
		public String getJiaoshiEmail() {
			return jiaoshiEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setJiaoshiEmail(String jiaoshiEmail) {
			this.jiaoshiEmail = jiaoshiEmail;
		}
		/**
		* 获取： 班级
		*/
		public Integer getBanjiTypes() {
			return banjiTypes;
		}
		/**
		* 设置： 班级
		*/
		public void setBanjiTypes(Integer banjiTypes) {
			this.banjiTypes = banjiTypes;
		}


			/**
			* 获取： 班级的值
			*/
			public String getBanjiValue() {
				return banjiValue;
			}
			/**
			* 设置： 班级的值
			*/
			public void setBanjiValue(String banjiValue) {
				this.banjiValue = banjiValue;
			}

		/**
		* 获取： 假删
		*/
		public Integer getJiaoshiDelete() {
			return jiaoshiDelete;
		}
		/**
		* 设置： 假删
		*/
		public void setJiaoshiDelete(Integer jiaoshiDelete) {
			this.jiaoshiDelete = jiaoshiDelete;
		}
	//级联表的get和set 课程

		/**
		* 获取： 课程编号
		*/
		public String getKechengUuidNumber() {
			return kechengUuidNumber;
		}
		/**
		* 设置： 课程编号
		*/
		public void setKechengUuidNumber(String kechengUuidNumber) {
			this.kechengUuidNumber = kechengUuidNumber;
		}

		/**
		* 获取： 课程名称
		*/
		public String getKechengName() {
			return kechengName;
		}
		/**
		* 设置： 课程名称
		*/
		public void setKechengName(String kechengName) {
			this.kechengName = kechengName;
		}

		/**
		* 获取： 课程封面
		*/
		public String getKechengPhoto() {
			return kechengPhoto;
		}
		/**
		* 设置： 课程封面
		*/
		public void setKechengPhoto(String kechengPhoto) {
			this.kechengPhoto = kechengPhoto;
		}
		/**
		* 获取： 课程类型
		*/
		public Integer getKechengTypes() {
			return kechengTypes;
		}
		/**
		* 设置： 课程类型
		*/
		public void setKechengTypes(Integer kechengTypes) {
			this.kechengTypes = kechengTypes;
		}


			/**
			* 获取： 课程类型的值
			*/
			public String getKechengValue() {
				return kechengValue;
			}
			/**
			* 设置： 课程类型的值
			*/
			public void setKechengValue(String kechengValue) {
				this.kechengValue = kechengValue;
			}

		/**
		* 获取： 课程热度
		*/
		public Integer getKechengClicknum() {
			return kechengClicknum;
		}
		/**
		* 设置： 课程热度
		*/
		public void setKechengClicknum(Integer kechengClicknum) {
			this.kechengClicknum = kechengClicknum;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取：课程 的 教师
		*/
		public Integer getKechengJiaoshiId() {
			return kechengJiaoshiId;
		}
		/**
		* 设置：课程 的 教师
		*/
		public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
			this.kechengJiaoshiId = kechengJiaoshiId;
		}

		/**
		* 获取： 课程介绍
		*/
		public String getKechengContent() {
			return kechengContent;
		}
		/**
		* 设置： 课程介绍
		*/
		public void setKechengContent(String kechengContent) {
			this.kechengContent = kechengContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getKechengDelete() {
			return kechengDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setKechengDelete(Integer kechengDelete) {
			this.kechengDelete = kechengDelete;
		}


	@Override
	public String toString() {
		return "PaikeView{" +
			", jiekeValue=" + jiekeValue +
			", xueqiValue=" + xueqiValue +
			", xingqiValue=" + xingqiValue +
			", kechengUuidNumber=" + kechengUuidNumber +
			", kechengName=" + kechengName +
			", kechengPhoto=" + kechengPhoto +
			", kechengClicknum=" + kechengClicknum +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", kechengContent=" + kechengContent +
			", kechengDelete=" + kechengDelete +
			", jiaoshiUuidNumber=" + jiaoshiUuidNumber +
			", jiaoshiName=" + jiaoshiName +
			", jiaoshiPhoto=" + jiaoshiPhoto +
			", jiaoshiPhone=" + jiaoshiPhone +
			", jiaoshiEmail=" + jiaoshiEmail +
			", jiaoshiDelete=" + jiaoshiDelete +
			"} " + super.toString();
	}
}
