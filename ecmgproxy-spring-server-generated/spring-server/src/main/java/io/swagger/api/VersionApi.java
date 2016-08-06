package io.swagger.api;


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

@Api(value = "Version", description = "the Version API")
public interface VersionApi {

    @ApiOperation(value = "The product version", notes = "", response = Void.class, tags={ "Version", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The version info for ECMGProxy", response = Void.class) })
    @RequestMapping(value = "/Version",
        produces = { "application/json", "text/plain" }, 
        method = RequestMethod.GET)
    ResponseEntity<Void> versionGet();

}
