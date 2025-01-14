import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Format, FormatFontWeightEnum, FormatUnderlineEnum, FormatColorEnum, FormatAlignmentHorizontalEnum, FormatAlignmentVerticalEnum, FormatPatternEnum,  } from '../../../model';
import { useAddFormatMutation } from '../../services/FormatService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Format
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const FontWeightValidation = () => { 
  return(
    [
      200, 400, 700, 
    ]
  )
};

const UnderlineValidation = () => { 
  return(
    [
      0, 1, 2, 21, 22, 
    ]
  )
};

const ColorValidation = () => { 
  return(
    [
      'Black', 'White', 'Red', 'BrightGreen', 'Blue', 'Yellow', 'Pink', 'Turquoise', 'DarkRed', 'Orange', 'DarkYellow', 'Green', 'Teal', 'LightBlue', 'Violet', 'Gray80', 
    ]
  )
};

const AlignmentHorizontalValidation = () => { 
  return(
    [
      'Left', 'Center', 'Right', 'Fill', 'Justify', 'CenterAcrossSelection', 
    ]
  )
};

const AlignmentVerticalValidation = () => { 
  return(
    [
      'Top', 'Middle', 'Bottom', 'Justify', 
    ]
  )
};

const PatternValidation = () => { 
  return(
    [
      0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     workbookId: Yup.string()
    
    
    
    
    ,
     fontWeight: Yup.number().oneOf(FontWeightValidation(), 'Invalid value selected for fontWeight')
    
    
    
    
    ,
     fontSize: Yup.number()
    
    
    
    
    ,
     fontFace: Yup.string()
    
    
    
    
    ,
     underline: Yup.number().oneOf(UnderlineValidation(), 'Invalid value selected for underline')
    
    
    
    
    ,
     color: Yup.string().oneOf(ColorValidation(), 'Invalid value selected for color')
    
    
    
    
    ,
     alignmentHorizontal: Yup.string().oneOf(AlignmentHorizontalValidation(), 'Invalid value selected for alignmentHorizontal')
    
    
    
    
    ,
     alignmentVertical: Yup.string().oneOf(AlignmentVerticalValidation(), 'Invalid value selected for alignmentVertical')
    
    
    
    
    ,
     pattern: Yup.number().oneOf(PatternValidation(), 'Invalid value selected for pattern')
    
    
    
    
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

const FormatForm: React.FC = () => {
  const [addFormat, addFormatResult] = useAddFormatMutation();

  const initialValues: Format = {
    
    
    workbookId : '3fa85f64-5717-4562-b3fc-2c963f66afa7',
    
    
    
    
    
        fontWeight :   FormatFontWeightEnum[Object.keys(FormatFontWeightEnum)[0]], 
    
    
    
    
    fontSize : 0, 
    
    
    
    
    
    fontFace : 'Arial',
    
    
    
    
    
        underline :   FormatUnderlineEnum[Object.keys(FormatUnderlineEnum)[0]], 
        color :   FormatColorEnum[Object.keys(FormatColorEnum)[0]], 
        alignmentHorizontal :   FormatAlignmentHorizontalEnum[Object.keys(FormatAlignmentHorizontalEnum)[0]], 
        alignmentVertical :   FormatAlignmentVerticalEnum[Object.keys(FormatAlignmentVerticalEnum)[0]], 
        pattern :   FormatPatternEnum[Object.keys(FormatPatternEnum)[0]], 
    
    
    id : 'f92ec5d1-7494-463f-b4a0-3c7a2724ff45',
    
    
    
    
    
    
    
    ownerId : '5f73b510-79e0-486d-a6b3-408e3dc84340',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'af6ed6a7-0262-41ca-a9ef-bd10a123e015',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '7567dcb0-bead-4e72-af95-cc3b18e44f9b',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Format>) => {
    setTimeout(() => {
      console.log(values);
      addFormat(values);
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
                          addFormatResult: {JSON.stringify(addFormatResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Format</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="workbookId" className="nice-form-control">
              <b>Workbook Id: {touched.workbookId && !errors.workbookId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* workbookId  TEXT FIELD */}
              <Field name="workbookId" type="text"
                className={errors.workbookId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="workbookId" component="span" />
            </label>


        
            <label htmlFor="fontWeight" className="nice-form-control">
              <b>Font Weight: {touched.fontWeight && !errors.fontWeight && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="fontWeight"
                className={errors.fontWeight ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('fontWeight', true);
                  setFieldValue('fontWeight', e.target.value);
                }}
              >
                <option value="" label="Select Font Weight" />
                <FontWeightLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="fontWeight" component="span" />
            </label>


        
            <label htmlFor="fontSize" className="nice-form-control">
              <b>Font Size: {touched.fontSize && !errors.fontSize && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
          {/*fontSize INTEGER FIELD */}
              <Field name="fontSize" type="text"
                className={errors.fontSize  ? 'form-control field-error' : ' nice-form-control form-control'} />
          
              
                        <ErrorMessage className='error' name="fontSize" component="span" />
            </label>


        
            <label htmlFor="fontFace" className="nice-form-control">
              <b>Font Face: {touched.fontFace && !errors.fontFace && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* fontFace  TEXT FIELD */}
              <Field name="fontFace" type="text"
                className={errors.fontFace  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="fontFace" component="span" />
            </label>


        
            <label htmlFor="underline" className="nice-form-control">
              <b>Underline: {touched.underline && !errors.underline && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="underline"
                className={errors.underline ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('underline', true);
                  setFieldValue('underline', e.target.value);
                }}
              >
                <option value="" label="Select Underline" />
                <UnderlineLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="underline" component="span" />
            </label>


        
            <label htmlFor="color" className="nice-form-control">
              <b>Color: {touched.color && !errors.color && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="color"
                className={errors.color ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('color', true);
                  setFieldValue('color', e.target.value);
                }}
              >
                <option value="" label="Select Color" />
                <ColorLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="color" component="span" />
            </label>


        
            <label htmlFor="alignment-horizontal" className="nice-form-control">
              <b>Alignment - horizontal: {touched.alignmentHorizontal && !errors.alignmentHorizontal && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="alignment-horizontal"
                className={errors.alignmentHorizontal ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('alignmentHorizontal', true);
                  setFieldValue('alignmentHorizontal', e.target.value);
                }}
              >
                <option value="" label="Select Alignment - horizontal" />
                <AlignmentHorizontalLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="alignmentHorizontal" component="span" />
            </label>


        
            <label htmlFor="alignment-vertical" className="nice-form-control">
              <b>Alignment - vertical: {touched.alignmentVertical && !errors.alignmentVertical && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="alignment-vertical"
                className={errors.alignmentVertical ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('alignmentVertical', true);
                  setFieldValue('alignmentVertical', e.target.value);
                }}
              >
                <option value="" label="Select Alignment - vertical" />
                <AlignmentVerticalLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="alignmentVertical" component="span" />
            </label>


        
            <label htmlFor="pattern" className="nice-form-control">
              <b>Pattern: {touched.pattern && !errors.pattern && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="pattern"
                className={errors.pattern ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('pattern', true);
                  setFieldValue('pattern', e.target.value);
                }}
              >
                <option value="" label="Select Pattern" />
                <PatternLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="pattern" component="span" />
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
                      <FaCheckCircle size={30} /> Create New Format
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

lowercase fontweightlookup
uppercase FONTWEIGHTLOOKUP
snakecase font_weight_lookup
pascalcase FontWeightLookup
camelcase fontWeightLookup
kebabcase font-weight-lookup


*/


const FontWeightLookup = () => { 
  return(
  <>
    
    <option value='200' label='fontWeightLight' />
    
    
    <option value='400' label='fontWeightRegular' />
    
    
    <option value='700' label='fontWeightBold' />
    
  </>
  )
};


/*

lowercase underlinelookup
uppercase UNDERLINELOOKUP
snakecase underline_lookup
pascalcase UnderlineLookup
camelcase underlineLookup
kebabcase underline-lookup


*/


const UnderlineLookup = () => { 
  return(
  <>
    
    <option value='0' label='underlineNone' />
    
    
    <option value='1' label='underlineSingle' />
    
    
    <option value='2' label='underlineDouble' />
    
    
    <option value='21' label='underlineSingleAccounting' />
    
    
    <option value='22' label='underlineDoubleAccounting' />
    
  </>
  )
};


/*

lowercase colorlookup
uppercase COLORLOOKUP
snakecase color_lookup
pascalcase ColorLookup
camelcase colorLookup
kebabcase color-lookup


*/

const ColorLookup = () => { 
  return(
  <>
    
    <option value='Black' label='Color Black' />
    
    
    <option value='White' label='Color White' />
    
    
    <option value='Red' label='Color Red' />
    
    
    <option value='BrightGreen' label='Color Bright Green' />
    
    
    <option value='Blue' label='Color Blue' />
    
    
    <option value='Yellow' label='Color Yellow' />
    
    
    <option value='Pink' label='Color Pink' />
    
    
    <option value='Turquoise' label='Color Turquoise' />
    
    
    <option value='DarkRed' label='Color Dark Red' />
    
    
    <option value='Orange' label='Color Orange' />
    
    
    <option value='DarkYellow' label='Color Dark Yellow' />
    
    
    <option value='Green' label='Color Green' />
    
    
    <option value='Teal' label='Color Teal' />
    
    
    <option value='LightBlue' label='Color Light Blue' />
    
    
    <option value='Violet' label='Color Violet' />
    
    
    <option value='Gray80' label='Color Gray 80' />
    
  </>
  )
};



/*

lowercase alignment-horizontallookup
uppercase ALIGNMENT-HORIZONTALLOOKUP
snakecase alignment_horizontal_lookup
pascalcase AlignmentHorizontalLookup
camelcase alignmentHorizontalLookup
kebabcase alignmenthorizontal-lookup


*/

const AlignmentHorizontalLookup = () => { 
  return(
  <>
    
    <option value='Left' label='Align Left' />
    
    
    <option value='Center' label='Align Center' />
    
    
    <option value='Right' label='Align Right' />
    
    
    <option value='Fill' label='Align Fill' />
    
    
    <option value='Justify' label='Align Justify' />
    
    
    <option value='CenterAcrossSelection' label='Align Center Across Selection' />
    
  </>
  )
};



/*

lowercase alignment-verticallookup
uppercase ALIGNMENT-VERTICALLOOKUP
snakecase alignment_vertical_lookup
pascalcase AlignmentVerticalLookup
camelcase alignmentVerticalLookup
kebabcase alignmentvertical-lookup


*/

const AlignmentVerticalLookup = () => { 
  return(
  <>
    
    <option value='Top' label='Align Top' />
    
    
    <option value='Middle' label='Align Middle' />
    
    
    <option value='Bottom' label='Align Bottom' />
    
    
    <option value='Justify' label='Align Justify' />
    
  </>
  )
};



/*

lowercase patternlookup
uppercase PATTERNLOOKUP
snakecase pattern_lookup
pascalcase PatternLookup
camelcase patternLookup
kebabcase pattern-lookup


*/


const PatternLookup = () => { 
  return(
  <>
    
    <option value='0' label='patternNone' />
    
    
    <option value='1' label='patternFilled' />
    
    
    <option value='2' label='patternLightFill' />
    
    
    <option value='3' label='patternMediumFill' />
    
    
    <option value='4' label='patternHeavyFill' />
    
    
    <option value='5' label='patternHorizontalStripes' />
    
    
    <option value='6' label='patternVerticalStripes' />
    
    
    <option value='7' label='patternDiagonalStripes' />
    
    
    <option value='8' label='patternDiagonalStripesAlt' />
    
    
    <option value='9' label='patternCheckerboard' />
    
  </>
  )
};





export default FormatForm;
