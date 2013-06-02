Blog-Maker
==========

Java Blog Web Framework (OOP Final Project)

Layered Architechture
------------

-UI : User Interface Layer

-PageBuiler : Layer which builds html pages. Needs a Post object (Post could be null)
	
	> PageFacade - Class which interacts with the client. Public methods include add / edit / delete posts to pages.

	> Page / PageFactory - The html pages. All pages include header(), body()(abstract), and footer(). PageFactory creates home, archive, and blog content pages.

		-IndexHTML / BlogPostHTML / ArchiveHTML : Concrete page classes.

	> PageWriter - Helper class that writes html files to the local disk (different from database).

-Posts : Layer that includes the Post class. All posts have a date, title, author, and content.

-Database : Layer that stores Post objects. Also returns an ArrayList<Post> that include all previosuly stored Posts.
