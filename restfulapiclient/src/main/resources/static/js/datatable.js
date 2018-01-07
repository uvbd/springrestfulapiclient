$(document).ready( function () {
	 var table = $('#osmBuidingInfoTable').DataTable({
			"sAjaxSource": "/osmDataInputTOs",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "osmDataOutputTO": "gId"},
		          { "osmDataOutputTO": "osmId" },
				  { "osmDataOutputTO": "type" },
				  { "osmDataOutputTO": "name" },
				  { "osmDataOutputTO": "geom" },
				  { "osmDataOutputTO": "areaSqkm" }
			]
	 })
});

