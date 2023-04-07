Feature: Product Compare

  Scenario: Validate the Breadcrumb that is displayed on the 'Product Compare' page
  Given Hover the mouse on any Menu say 'Desktops' and select 'Show All Desktops' option
  When In the displayed 'Desktops' category page, click on 'Product Compare(0)' link
  And Check the working of Breakcrumb available on the 'Product Compare' page
  Then Breadcrumb should work without any problems

