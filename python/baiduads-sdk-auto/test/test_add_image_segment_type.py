"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.imagesegment.model.coordinate_type import CoordinateType
from baiduads.imagesegment.model.logo_pic_type import LogoPicType
globals()['CoordinateType'] = CoordinateType
globals()['LogoPicType'] = LogoPicType
from baiduads.imagesegment.model.add_image_segment_type import AddImageSegmentType


class TestAddImageSegmentType(unittest.TestCase):
    """AddImageSegmentType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddImageSegmentType(self):
        """Test AddImageSegmentType"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddImageSegmentType()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
