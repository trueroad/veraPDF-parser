package org.verapdf.parser.postscript;

/**
 * Exception that occurs during PostScript program parsing.
 *
 * @author Sergey Shemyakov
 */
public class PostScriptException extends Exception {

	private static final long serialVersionUID = 6312613772462589873L;

	public PostScriptException() {
    }

    public PostScriptException(String message) {
        super(message);
    }

    public PostScriptException(String message, Throwable cause) {
        super(message, cause);
    }
}
