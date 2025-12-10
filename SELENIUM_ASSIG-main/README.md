### DRIVER METHODS:

```
a.get()-Opens the specified URL in the current browser window.

b. getCurrentURL() – Returns the URL of the webpage currently opened.

c. getPageSource() – Returns the complete HTML source code of the current page.

d. getTitle() – Returns the title of the current webpage.

e. close() vs quit() – close() closes only the current window; quit() closes all browser windows and ends the WebDriver session.

f. getWindowHandle() – Returns the unique ID of the current browser window.

g. getWindowHandles() – Returns a Set of IDs of all opened browser windows.

h. navigate() – Used to move back, forward, refresh, or open a URL using navigation commands.

i. switchTo() – Switches the driver's focus to another window, alert, frame, or element.

```

### WEB-ELEMENT METHODS:

```
a. sendKeys() – used for Entering text into a textbox.

b. clear() – Clears the existing value from an input field.

c. click() – Clicks on a web element such as a button,link,checkbox.

d. findElement() – finds and gives the first matching element inside the current element.

e. findElements() – Gives a list of all matching elements inside the current element.

f. getDomAttribute() – Returns the value of an attribute directly from the DOM, even if modified by JavaScript.

g. getScreenshotAs() – Captures a screenshot of the current element and returns it in the specified format.

h. getText() – Returns the visible  text of a web element.

i. isDisplayed() – Checks if the element is visible on the page, returns true/false.

j. isEnabled() – Checks if the element is interactable, returns true/false.

k. isSelected() – Checks if the element (checkbox/radio/button) is selected, returns true/false.

```
