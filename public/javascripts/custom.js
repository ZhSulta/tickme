
jQuery(document).ready(function(){

	jQuery( "#invitesubmit" ).click(function() {

		var input = jQuery( "#s" ).val();
		if(validEmail(input))
		{
			jQuery.getJSON("/invitations", {user: input}, function(json) { 
				if(json.status == 0)
					alert("The request could not been received. Please try again later");
				else {

					jQuery(".search-form").slideToggle('slow', function() {});
					jQuery("#invite-done").slideToggle('slow', function() {});
				}
            }).fail(function() { alert( "The request could not been sent. Please try again later" ); });  
		}
		else alert("Please enter a valid email");

	});


	jQuery( "a[href|='donate']" ).click(function() {

		try {
			if(window.location.pathname != "/")
			window.location = "/";

			var aTag = jQuery("#donate-container");
			jQuery('html,body').animate({scrollTop: aTag.offset().top},'slow');
		} catch(e) { window.location = "/"; }	
		
		return false;
	});

	setTimeout(function() {

		jQuery("#coinbase-holder > iframe").addClass("coinbase-fixer");

	}, 1000);

});


function validEmail(v) {
    var r = new RegExp("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
    return (v.match(r) == null) ? false : true;
}