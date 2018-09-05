jQuery(document).ready(function() {
    //For external links only:
    jQuery(".external-link").attr("target", "_blank");
    //For all type of links (internal and external):
    jQuery(".wiki-content a").attr("target", "_blank");
});