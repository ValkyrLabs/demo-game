import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Accordion, Form as BSForm, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import * as Yup from 'yup';
import CoolButton from '../../../../components/CoolButton';
import { OasOpenAPISpec, OasOpenAPISpecOpenapiEnum, OasOpenAPISpecSourceTypeEnum, } from '../../../model';
import { useAddOasOpenAPISpecMutation } from '../../services/OasOpenAPISpecService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Peragon Games ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasOpenAPISpec
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const SourceTypeValidation = () => { 
  return(
    [
      'valkyrlabs', 'github', 'self', 'gitlab', 'bitbucket', 'vendor', 'notfound', 
    ]
  )
};

const OpenapiValidation = () => { 
  return(
    [
      '3.0.0', '3.0.1', '3.0.2', '3.1.0', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     sourcePath: Yup.string()
    
    
    .required('sourcePath is required.')
    
    ,
     sourceType: Yup.string().oneOf(SourceTypeValidation(), 'Invalid value selected for sourceType')
    
    
    .required('sourceType is required.')
    
    ,
     execModuleId: Yup.string()
    
    
    
    
    ,
     sourceDetails: Yup.string()
    
    
    
    
    ,
     openapi: Yup.string().oneOf(OpenapiValidation(), 'Invalid value selected for openapi')
    
    
    
    
    ,
             id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const OasOpenAPISpecForm: React.FC = () => {
  const [addOasOpenAPISpec, addOasOpenAPISpecResult] = useAddOasOpenAPISpecMutation();

  const initialValues: OasOpenAPISpec = {
    
    
    sourcePath : 'null',
    
    
    
    
    
        sourceType :   OasOpenAPISpecSourceTypeEnum[Object.keys(OasOpenAPISpecSourceTypeEnum)[0]], 
    
    
    execModuleId : 'null',
    
    
    
    
    
    
    
    sourceDetails : 'null',
    
    
    
    
    
        openapi :   OasOpenAPISpecOpenapiEnum[Object.keys(OasOpenAPISpecOpenapiEnum)[0]], 
    
    
    id : 'db63601a-6cd0-4805-990d-2948612f3bd8',
    
    
    
    
    
    
    
    ownerId : '2ad692b0-c0a5-49d1-8253-9ccb8fdfdd37',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : '2177600e-ea4c-4ea5-bb21-4e194c39a7b8',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : 'fdc9e8e7-187e-4514-9bd6-8452a744e101',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<OasOpenAPISpec>) => {
    setTimeout(() => {
      console.log(values);
      addOasOpenAPISpec(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >

        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addOasOpenAPISpecResult: {JSON.stringify(addOasOpenAPISpecResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New OasOpenAPISpec</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="sourcePath" className="nice-form-control">
              <b>Source Path: {touched.sourcePath && !errors.sourcePath && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* sourcePath  TEXT FIELD */}
              <Field name="sourcePath" type="text"
                className={errors.sourcePath  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="sourcePath" component="span" />
            </label>


        
            <label htmlFor="sourceType" className="nice-form-control">
              <b>Source Type: {touched.sourceType && !errors.sourceType && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="sourceType"
                className={errors.sourceType ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('sourceType', true);
                  setFieldValue('sourceType', e.target.value);
                }}
              >
                <option value="" label="Select Source Type" />
                <SourceTypeLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="sourceType" component="span" />
            </label>


        
            <label htmlFor="execModuleId" className="nice-form-control">
              <b>Exec Module Id: {touched.execModuleId && !errors.execModuleId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* execModuleId  TEXT FIELD */}
              <Field name="execModuleId" type="text"
                className={errors.execModuleId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="execModuleId" component="span" />
            </label>


        
            <label htmlFor="sourceDetails" className="nice-form-control">
              <b>Source Details: {touched.sourceDetails && !errors.sourceDetails && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* sourceDetails  TEXT FIELD */}
              <Field name="sourceDetails" type="text"
                className={errors.sourceDetails  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="sourceDetails" component="span" />
            </label>


        
            <label htmlFor="openapi" className="nice-form-control">
              <b>Openapi: {touched.openapi && !errors.openapi && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="openapi"
                className={errors.openapi ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('openapi', true);
                  setFieldValue('openapi', e.target.value);
                }}
              >
                <option value="" label="Select Openapi" />
                <OpenapiLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="openapi" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
                    >
                      {isSubmitting && (
                        <Spinner
                          style={ { float: "left" } }
                          as="span"
                          animation="grow"
                          variant="light"
                          aria-hidden="true"
                        />
                      )}
                      <FaCheckCircle size={30} /> Create New OasOpenAPISpec
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase sourcetypelookup
uppercase SOURCETYPELOOKUP
snakecase source_type_lookup
pascalcase SourceTypeLookup
camelcase sourceTypeLookup
kebabcase source-type-lookup


*/

const SourceTypeLookup = () => { 
  return(
  <>
    
    <option value='valkyrlabs' label='Peragonlabs' />
    
    
    <option value='github' label='Github' />
    
    
    <option value='self' label='Self' />
    
    
    <option value='gitlab' label='Gitlab' />
    
    
    <option value='bitbucket' label='Bitbucket' />
    
    
    <option value='vendor' label='Vendor' />
    
    
    <option value='notfound' label='Notfound' />
    
  </>
  )
};



/*

lowercase openapilookup
uppercase OPENAPILOOKUP
snakecase openapi_lookup
pascalcase OpenapiLookup
camelcase openapiLookup
kebabcase openapi-lookup


*/

const OpenapiLookup = () => { 
  return(
  <>
    
    <option value='3.0.0' label='_ 00' />
    
    
    <option value='3.0.1' label='_ 01' />
    
    
    <option value='3.0.2' label='_ 02' />
    
    
    <option value='3.1.0' label='_ 10' />
    
  </>
  )
};






export default OasOpenAPISpecForm;