package com.github.jreddit.request.action.mark;

import com.github.jreddit.request.action.ActionRequest;

public class VoteRequest extends ActionRequest {
	
	/** Endpoint format. */
	private static final String ENDPOINT_FORMAT = "/vote?";

	/**
	 * Vote request constructor.
	 * 
	 * @param fullname Fullname of what to vote on
	 * @param direction Direction (must be -1, 0, or 1)
	 */
	public VoteRequest(String fullname, int direction) {
		super(fullname);
		this.addBodyParameter("dir", String.valueOf(direction));
	}
	
	@Override
	public String generateRedditURI() {
		return ENDPOINT_FORMAT;
	}
	
}
