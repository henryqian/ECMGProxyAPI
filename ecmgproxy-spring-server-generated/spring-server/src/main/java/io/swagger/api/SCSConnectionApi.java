package io.swagger.api;

import io.swagger.model.SCSConnection;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-06T10:57:42.355Z")

@Api(value = "SCSConnection", description = "the SCSConnection API")
public interface SCSConnectionApi {

    @ApiOperation(value = "Create a new SCSConnection object", notes = "This will create a new SCSConnection object. ", response = SCSConnection.class, tags={ "SCSConnection", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "This returns a SCSConnection object in JSON form.", response = SCSConnection.class),
        @ApiResponse(code = 400, message = "Invalid data", response = SCSConnection.class),
        @ApiResponse(code = 403, message = "When authentication or authorization failed.", response = SCSConnection.class),
        @ApiResponse(code = 500, message = "Internal server error", response = SCSConnection.class) })
    @RequestMapping(value = "/SCSConnection/{id}",
        produces = { "application/json", "text/plain" }, 
        method = RequestMethod.POST)
    ResponseEntity<SCSConnection> sCSConnectionIdPost(@ApiParam(value = "",required=true ) @PathVariable("id") String id,@ApiParam(value = "" ,required=true ) @RequestBody SCSConnection body,@ApiParam(value = "" ,required=true ) @RequestHeader(value="Authorization", required=true) String authorization);

}
