//<![CDATA[
jQuery(document).ready(function() {
	function onAfter(curr, next, opts, fwd) {
var index = opts.currSlide;
jQuery('#prev,#prev2,#prev3,#prev4,#prev5')[index == 0 ? 'hide' : 'show']();
jQuery('#next,#next2,#next3,#next4,#next5')[index == opts.slideCount - 1 ? 'hide' : 'show']();
//get the height of the current slide
var $ht = jQuery(this).height();
//set the container's height to that of the current slide
jQuery(this).parent().animate({height: $ht});
}
    jQuery('.testimonials').after('<div class="testimonial-pager">&nbsp;</div>').cycle({
		fx: 'fade',
		timeout: 8000,
		height: 'auto',
		pause: 1,
		pager: '.testimonial-pager',
		before: onAfter,
		cleartypeNoBg: true

	});
});
//]]>