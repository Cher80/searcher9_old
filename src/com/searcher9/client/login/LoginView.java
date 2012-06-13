package com.searcher9.client.login;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

public class LoginView extends Composite  {

	 	SimplePanel viewPanel = new SimplePanel();
	    Element nameSpan = DOM.createSpan();

	    public LoginView() {
	    	nameSpan.setInnerText("Good-bye, Login");
	        viewPanel.getElement().appendChild(nameSpan);
	        initWidget(viewPanel);
	    }



   // public void setPresenter(Presenter presenter) {
     //       this.presenter = presenter;
    //}
}
