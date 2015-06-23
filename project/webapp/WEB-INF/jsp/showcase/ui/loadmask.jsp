<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://www.osworks.cn/tag/aos" prefix="aos"%>
<aos:html>
<aos:head title="阴影遮盖">
	<aos:include lib="ext" />
</aos:head>
<aos:body>
</aos:body>
<aos:onready>
	<aos:viewport>
		<aos:container width="500" height="50" margin="10" autoShow="true" layout="hbox">
			<aos:button text="阴影1" onclick="fntest1" margin="10" />
			<aos:button text="关闭阴影1" onclick="fntest2" margin="10" />
			<aos:button text="阴影2" onclick="fntest3" margin="10" />
			<aos:button text="关闭阴影2" onclick="fntest4" margin="10" />
			<aos:button text="阴影3" onclick="fntest5" margin="10" />
		</aos:container>
		<aos:panel id="mypanel" title="测试" width="600" height="400" margin="10"></aos:panel>
	</aos:viewport>

	<script type="text/javascript">
		var myMask = Ext.create('Ext.LoadMask', {
			target : mypanel,
			useTargetEl : false, //只遮盖容器内部区域(不含标题)
			msg : "正在初始化, 请稍候..."
		});

		function fntest1() {
			myMask.show();
		}

		function fntest2() {
			myMask.hide();
		}

		function fntest3() {
			App.mask('正在保存数据...', mypanel);
			//App.mask('正在保存数据...',mypanel.el);
			//App.mask(mypanel);
		}

		function fntest4() {
			App.unmask();
		}

		function fntest5() {
			App.mask(null, document.body);
		}
	</script>
</aos:onready>
</aos:html>