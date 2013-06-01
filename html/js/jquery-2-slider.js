//<![CDATA[
jQuery(window).load(function() {
jQuery('.home-banner-wrap ul').css("background-image", "none");
jQuery('.jqslider').css("display", "block");
jQuery('.big-banner #main .main-area').css("padding-top", "16px");
jQuery('.home-banner-wrap ul').after('<div class="jquery-pager">&nbsp;</div>').cycle({
	fx: 'fade',
	timeout: 8000,
	height: 'auto',
	pause: 0,
	pager: '.jquery-pager',
	cleartypeNoBg: true

});
});
//]]>