//<![CDATA[
jQuery(window).load(function() {
  jQuery('.home-bnr-jquery ul').css("background-image", "none");
  jQuery('.jqslider').css("display", "block");
  jQuery('.home-bnr-jquery ul').after('<div class="jquery-pager">&nbsp;</div>').cycle({
	  fx: 'fade',
	  timeout: 8000,
	  height: 'auto',
	  pause: 0,
	  pager: '.jquery-pager',
	  cleartypeNoBg: true

  });
});
//]]>