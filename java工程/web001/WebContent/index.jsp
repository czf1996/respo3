<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
		<style>
			ul{
				list-style-type: none;
			}
			ul li{
				float: left;
				margin: 10px 10px;
			}
			h2{
				clear: left;
			}
		</style>
		<!-- 重定向 -->
		<%
   response.sendRedirect(request.getContextPath()+"/IndexServlet");
       %> 
	</head>
	<body>
		<h2 style="color: blue;">历史类书籍</h2>
		<ul>
			<hr color="black" size="3">
			<li>
			<img src="img/2.jpg" />
			<div >故宫日历(公历2020年)(精)</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/history01.jpg" />
			<div >天朝的崩溃(鸦片战争再研究修订版)(精)</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3093646.jpg"img/history01.jpg" />
			<div >中国历史的教训</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3222641.jpg" />
			<div >世界历史很有趣(袁腾飞讲美国史)</div>
			<span>¥41.80</span><br/>
			</li>
		</ul>
		
	    <h2 style="color: blue;">音乐类书籍</h2>
	    <hr color="black" size="3">
		<ul>
			<li>
			<img src="img/2018081030231610-25503.jpg@!w210.jpg" />
			<div >乐评人的自我修养</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/2874636.jpg@!w210.jpg" />
			<div > 与小泽征尔共度的午后音乐时光(精)</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3212540.jpg@!w210.jpg" />
			<div >欢娱的巅峰--唐代教坊考(精)</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3278144-fm.jpg@!w210.jpg" />
			<div >德奥名人论音乐和音乐美</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3283148-fm.jpg@!w210.jpg" />
			<div >平行与吊诡</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3514895-fm.jpg@!w210.jpg" />
			<div >律吕精义(精)</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3825970.jpg@!w210.jpg" />
			<div >新音乐的哲学</div>
			<span>¥41.80</span><br/>
			</li>
			
			<li>
			<img src="img/3909387-fm.jpg@!w210.jpg" />
			<div >音乐与情感</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3922787-fm.jpg@!w210.jpg" />
			<div >布伦德尔谈钢琴(原版引进)(精)</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3928500-fm.jpg@!w210.jpg" />
			<div > 论巴赫(精)/六点音乐译丛</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3964481-fm.jpg@!w210.jpg" />
			<div >穿T恤听古典音乐--巨匠时代(精)</div>
			<span>¥41.80</span><br/>
			</li>
			<li>
			<img src="img/3434335.jpg@!w210.jpg" />
			<div >古典风格(海顿莫扎特贝多芬修订版)(精)</div>
			<span>¥41.80</span><br/>
			</li>
			
		</ul>
	</body>
</html>
