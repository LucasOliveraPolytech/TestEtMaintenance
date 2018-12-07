package com.polytech.serenity.pages;


import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class SearchResultsPage extends PageObject{
	
	@FindBy(css = "html.fonts-loaded body div.l-root.l-reskin h1.p-page-title.p-page-title--top")
	private WebElementFacade resultsHeader;
	
	@FindBy(css = "html.fonts-loaded body div.l-root.l-reskin section.l-wrapper div.l-segment.l-sidebar-fixed div.l-col__sidebar div.c-filter-list.js-active ul li a")
	private WebElementFacade streamsButton;
	
	public boolean resultContainsText(String word) {
		return resultsHeader.containsText(word.toUpperCase());
	}

	public void resultsStreamsOnly() {
		streamsButton.click();
	}

	public boolean streamsOnlySelected() {
		return streamsButton.isSelected();
	}
}
