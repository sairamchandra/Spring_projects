package com.constructor;

public class Html {
private String html;
private String css;
//public Html(String html, String css) {
//	
//	this.html = html;
//	this.css = css;
//}




public String getHtml() {
	return html;
}
public void setHtml(String html) {
	this.html = html;
}

public String getCss() {
	return css;
}

public void setCss(String css) {
	this.css = css;
}

@Override
public String toString() {
	return "Html [html=" + html + ", css=" + css + "]";
}

}
