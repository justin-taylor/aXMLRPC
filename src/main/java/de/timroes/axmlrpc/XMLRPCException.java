package de.timroes.axmlrpc;

/**
 * The exception is thrown whenever the remote procedure call fails in some point.
 *
 * @author Tim Roes
 */
public class XMLRPCException extends Exception {

    private int statusCode = -1;

	public XMLRPCException() {
		super();
	}
	
	public XMLRPCException(Exception ex) {
		super(ex);
	}

	public XMLRPCException(Exception ex, int statusCode) {
		super(ex);
        this.statusCode = statusCode;
	}

	public XMLRPCException(String ex) {
		super(ex);
	}

	public XMLRPCException(String ex, int statusCode) {
		super(ex);
        this.statusCode = statusCode;
	}

	public XMLRPCException(String msg, Exception ex) {
		super(msg, ex);
	}

	public XMLRPCException(String msg, Exception ex, int statusCode) {
		super(msg, ex);
        this.statusCode = statusCode;
	}

    public int statusCode()
    {
        return statusCode;
    }

}
