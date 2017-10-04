$(document).ready(
		function(){
			
			$("h1").css({"color":"green","font-size":"30px","text-align":"center"});
			$("h3").css({"color":"black","font-size":"20px","text-align":"center"});
			
			$("#hyper a").css({"color":"blue","font-size":"14px","align":"center"});
			$("#hyper a").hover(
			function(){
				$(this).css({"color":"red","font-size":"16px","align":"center"});
			},
			function(){
				$(this).css({"color":"blue","font-size":"14px","align":"center"});
			}		
			
			)
		
		$("table tr:odd").css({"background-color":"yellow"});
		$("table tr:even").css({"background-color":"pink"});
		
		}
		
);